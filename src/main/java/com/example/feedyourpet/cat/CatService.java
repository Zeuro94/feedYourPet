package com.example.feedyourpet.cat;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    private final CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    public Cat getCatById(Long id) {
        return catRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Cat not found for id :: " + id)
                );
    }

    public void addNewCat(Cat cat) {
        catRepository.save(cat);
    }

    public void updateCatById(
            Long id,
            Cat updatedCat) {
        Cat cat = catRepository.findById(id).orElse(new Cat());
        cat.setColour(updatedCat.getColour());
        cat.setBreed(updatedCat.getBreed());
        cat.setSize(updatedCat.getSize());
        catRepository.save(cat);
    }

    public void deleteCatById(Long id) {
        boolean exists = catRepository.existsById(id);
        if (!exists) {
            throw new RuntimeException("Cat not found for id :: " + id);
        }
        catRepository.deleteById(id);
    }
}
