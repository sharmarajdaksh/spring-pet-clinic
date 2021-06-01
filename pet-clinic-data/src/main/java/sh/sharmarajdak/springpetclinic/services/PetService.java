package sh.sharmarajdak.springpetclinic.services;

import java.util.Set;

import sh.sharmarajdak.springpetclinic.models.Pet;

public interface PetService {
	Pet findById(Long id);

	Pet save(Pet owner);

	Set<Pet> findAll();

}
