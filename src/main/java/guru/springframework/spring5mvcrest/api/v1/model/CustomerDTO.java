package guru.springframework.spring5mvcrest.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    @ApiModelProperty(value = "This is First Name", required = true)// this line is added for swagger documentation
    private String firstname;

    @ApiModelProperty(required = true)// this line is added for swagger documentation
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}
