package com.managerTopicSubject.mts.dto.topic;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
public class TopicUpdateRequestDTO {

    @Id
    private Long id;

    @NotNull @NotBlank @Size(min = 1, max = 20)
    private String code;

    @NotNull @NotBlank @Size(min = 5, max = 100)
    private String name;

    @NotNull @NotBlank
    private String startTime;

    @NotNull @NotBlank
    private String endTime;

    @Id
    private Long facultyId;

    @Id
    private Long teacherId;

    @Id
    private Long typeTopicId;


    /********************************************************************************************/

//    @NotNull @NotBlank //format: [start_date**end_date**content, start_date**end_date**content,...]
//    private String[] deadlines;

    @NotNull @NotBlank
    private List<DeadlineDTO> deadlines;

    public TopicUpdateRequestDTO(@NotNull @NotBlank @Size(min = 1, max = 20) String code, @NotNull @NotBlank @Size(min = 5, max = 100) String name, @NotNull @NotBlank String startTime, @NotNull @NotBlank String endTime, Long facultyId, Long teacherId, Long typeTopicId, @NotNull @NotBlank List<DeadlineDTO> deadlines) {
        this.code = code;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.facultyId = facultyId;
        this.teacherId = teacherId;
        this.typeTopicId = typeTopicId;
        this.deadlines = deadlines;
    }
}
