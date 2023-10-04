package com.fundservice.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundservice.dto.DistributionDto;
import com.fundservice.entities.Percentage;
import com.fundservice.service.PercentageService;

@RestController
@RequestMapping(path = "/percentages")
public class PercentageController {
	@Autowired
	private PercentageService percentageService;

	@GetMapping(path = "{id}")
	public List<Percentage> getByMutualFundId(@PathVariable(name = "id") int id) {
		return percentageService.getByMutualFundId(id);
	}

	@PostMapping(path = "{id}")
	public String addPercentages(@RequestBody DistributionDto distribution, @PathVariable(name = "id") int id) {
		return percentageService.addPercentages(distribution, id);
	}

	@DeleteMapping(path = "{id}")
	public String deletePercentages(@PathVariable(name = "id") int id) {
		return percentageService.deletePercentages(id);
	}
}
