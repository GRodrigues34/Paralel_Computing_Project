package br.com.pcproject.PCP.model;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class ApiResponse<T>{

    private String status;
    private T data;

}
