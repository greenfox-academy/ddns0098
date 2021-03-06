package com.greenfoxacademy.foxproject.services;

import com.greenfoxacademy.foxproject.models.Pet;
import com.greenfoxacademy.foxproject.repositories.PetRepository;
import com.greenfoxacademy.foxproject.temp.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetServiceImpl implements PetService {

  private PetRepository petRepository;

  @Autowired
  public PetServiceImpl(PetRepository petRepository) {
    this.petRepository = petRepository;
  }

  @Override
  public Pet login(String name) {
    if (!name.equals("")) {
      Pet pet = petRepository.findOne(name);
      if (pet == null) {
        petRepository.addPet(name);
        pet = petRepository.findOne(name);
        return pet;
      }
      return pet;
    }
    return null;
  }

  public Pet findOne(String name) {
    return petRepository.findOne(name);
  }

  public boolean checkLogged(Pet pet) {
    return Util.loggedInPet == pet;
  }
}
