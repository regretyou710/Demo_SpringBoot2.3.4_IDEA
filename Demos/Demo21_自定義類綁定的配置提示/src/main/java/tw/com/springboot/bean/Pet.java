package tw.com.springboot.bean;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Pet {
    private String name;
    private Double weight;
}
