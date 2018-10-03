package com.github.pythagoras.floor.rest;

import com.github.pythagoras.floor.domain.Floor;
import com.github.pythagoras.floor.service.FloorService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class FloorController {
    @Autowired
    private FloorService floorService;

    @RequestMapping(value = "/api/floor", method = RequestMethod.GET)
    public String listFloors(ModelMap model) {
        return floorService.listFloors(model);
    }

    @RequestMapping(value = "/api/floor/add", method = RequestMethod.POST)
    public String addFloor(@ModelAttribute("floor") Floor floor, BindingResult result) {
        return floorService.saveFloor(floor);
    }

    @RequestMapping("/api/floor/delete/{Id}")
    public String deleteFloor(@PathVariable("Id") Long floorId) {
        return floorService.deleteFloor(floorId);
    }

    @RequestMapping(value = "/api/floors", method = RequestMethod.GET)
    @ResponseBody
    public String listFloorsJson(ModelMap model) throws JSONException {
        return floorService.listFloorsAsJsonString(model);
    }

}