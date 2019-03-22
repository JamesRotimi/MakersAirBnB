package com.example.MakersAirBnb.MakersAirBnb.spaces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceRepository extends JpaRepository<Space, Long> {
    public Space findById(Space space);
}