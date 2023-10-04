package com.fundservice.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundservice.dto.MutualFundDto;
import com.fundservice.entities.MutualFund;
import com.fundservice.exceptions.MutualFundNotFoundException;
import com.fundservice.service.MutualFundService;

@RestController
@RequestMapping(path = "/mutualfunds")
public class MutualFundController {
	@Autowired
	private MutualFundService mutualfundService;

	@GetMapping(path = "/")
	private List<MutualFund> getAll() {
		return mutualfundService.getAll();
	}

	@GetMapping(path = "{id}")
	private MutualFund getById(@PathVariable(name = "id") int id) throws MutualFundNotFoundException {
		return mutualfundService.getById(id);
	}

	@PostMapping("/")
	private String addMutualFund(@RequestBody MutualFund mutualfund) {
		return mutualfundService.addMutualFund(mutualfund);
	}

	@PutMapping("{id}")
	private String updateMutualFund(@RequestBody MutualFundDto mutualfundDto, @PathVariable(name = "id") int id) {
		return mutualfundService.updateMutualFund(mutualfundDto, id);
	}

	@DeleteMapping("{id}")
	private String deleteMapping(@PathVariable(name = "id") int id) {
		return mutualfundService.deleteMutualFund(id);
	}
}
