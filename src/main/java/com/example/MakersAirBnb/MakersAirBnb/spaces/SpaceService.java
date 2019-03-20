package com.example.MakersAirBnb.MakersAirBnb.spaces;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceService {

    private SpaceRepository spaceRepository;

    public SpaceService(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }


    public List<Space> getAllSpaces() {
        return spaceRepository.findAll();
    }


    public Space getSpace(Long id) {
        return spaceRepository.findById(id).orElse(null);
    }

    public void addSpace(Space space) {
        spaceRepository.save(space);
    }

    public void updateSpace(Space space) {
        spaceRepository.save(space);
    }

    public void deleteSpace(Long id) {
        spaceRepository.deleteById(id);
    }
}