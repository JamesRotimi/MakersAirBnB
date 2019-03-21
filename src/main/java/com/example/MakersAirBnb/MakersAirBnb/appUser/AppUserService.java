package com.example.MakersAirBnb.MakersAirBnb.appUser;

import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    private AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public void addAppUser(AppUser appUser) {
        appUserRepository.save(appUser);
    }
}
