package com.motoshop.admin.state;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.motoshop.common.entity.Country;
import com.motoshop.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {

	public List<State> findByCountryOrderByNameAsc(Country country);
}
