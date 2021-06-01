package sh.sharmarajdak.springpetclinic.services;

import java.util.Set;

import sh.sharmarajdak.springpetclinic.models.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
