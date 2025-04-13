package resumer.smart_resumer.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="job_Descriptions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobDescription {

    @Id
    private String id;
    private String title;
    private String company;
    private String rawText;
    private List<String> skills;
    private List<String> responsibilities;
    private LocalDateTime uploadedAt;

}
