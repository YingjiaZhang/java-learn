package pers.zy.fasterxml.study.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String userName;
    private int aGe;
    private String ID;
    private String firstName;
    private String last_name;

}
