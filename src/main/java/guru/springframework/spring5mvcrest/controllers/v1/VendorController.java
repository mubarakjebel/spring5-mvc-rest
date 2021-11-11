package guru.springframework.spring5mvcrest.controllers.v1;

import guru.springframework.spring5mvcrest.api.v1.model.VendorDTO;
import guru.springframework.spring5mvcrest.api.v1.model.VendorListDTO;
import guru.springframework.spring5mvcrest.services.VendorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@ApiOperation(value = "View list of Vendors.", notes = "These are some API Notes.")// this line is added for swagger@RestController
@RequestMapping(VendorController.BASE_URL)
public class VendorController {
    public static final String BASE_URL = "/api/v1/vendors";

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @ApiOperation(value = "This will get a list of Vendors.", notes = "These are notes for Vendor API.")// this line is added for swagger documentation
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    VendorListDTO getAllVendors() {
        return vendorService.getAllVendors();
    }

    @ApiOperation(value = "Get Vendor by Id")// this line is added for swagger documentation
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO getVendorById(@PathVariable Long id) {
        return vendorService.getVendorById(id);
    }

    @ApiOperation(value = "Create new Vendor")// this line is added for swagger documentation
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VendorDTO createNewVendor(@RequestBody VendorDTO vendorDTO) {
        return vendorService.createNewVendor(vendorDTO);
    }

    @ApiOperation(value = "Update Vendor")// this line is added for swagger documentation
    @PutMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO updateVendor(@PathVariable Long id, @RequestBody VendorDTO vendorDTO) {
        return vendorService.saveVendorByDTO(id, vendorDTO);
    }

    @ApiOperation(value = "Patch Vendor")// this line is added for swagger documentation
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO patchVendor(@PathVariable Long id, @RequestBody VendorDTO vendorDTO) {
        return vendorService.saveVendorByDTO(id, vendorDTO);
    }

    @ApiOperation(value = "Delete Vendor")// this line is added for swagger documentation
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable Long id) {
        vendorService.deleteVendorById(id);
    }
}
