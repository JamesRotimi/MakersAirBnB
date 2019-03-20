package com.example.MakersAirBnb.MakersAirBnb.spaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    public class SpacesController {

        @Autowired
        private SpaceService spaceService;

        @RequestMapping(method = RequestMethod.GET, value = "/spaces")
        public List<Space> getAllSpaces() {

            return spaceService.getAllSpaces();
         }

        @RequestMapping("/space/{id}")
        public Space getSpace(@PathVariable Long id) {
            return spaceService.getSpace(id);
        }

        @RequestMapping(method = RequestMethod.POST, value = "/spaces")
        public void addSpace(@RequestBody Space space) {
            spaceService.addSpace(space);
        }

        @RequestMapping(method = RequestMethod.PUT, value = "/spaces/{id}")
        public void updateSpace(@RequestBody Space space) {
            spaceService.updateSpace(space);
        }

        @RequestMapping(method = RequestMethod.DELETE, value = "/spaces/{id}")
        public void deleteSpace(@PathVariable Long id) {
            spaceService.deleteSpace(id);
        }
}
