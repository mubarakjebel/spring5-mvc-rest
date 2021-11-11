package guru.springframework.spring5mvcrest.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {

    @ApiModelProperty(value = "This is Vendor Name", required = true)// this line is added for swagger documentation
    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;
}
