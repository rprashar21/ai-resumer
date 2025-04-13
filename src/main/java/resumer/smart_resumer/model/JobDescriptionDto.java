package resumer.smart_resumer.model;

import lombok.Data;

@Data
public class JobDescriptionDto {
    private String title;
    private String company;
    private String rawText; // full pasted jd
}
