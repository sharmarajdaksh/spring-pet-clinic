package sh.sharmarajdak.springpetclinic.services;

import java.util.Set;

import sh.sharmarajdak.springpetclinic.models.Vet;

public interface VetService {
	Vet findById(Long id);

	Vet save(Vet owner);

	Set<Vet> findAll();

}
