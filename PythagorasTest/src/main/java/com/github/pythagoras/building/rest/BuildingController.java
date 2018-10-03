package com.github.pythagoras.building.rest;

import com.github.pythagoras.building.domain.Building;
import com.github.pythagoras.building.service.BuildingService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class BuildingController {
    @Autowired
    private BuildingService buildingService;

    @RequestMapping(value = "/api/building", method = RequestMethod.GET)
    public String listBuildings(ModelMap model) {
        return buildingService.listBuildings(model);

    }

    @RequestMapping(value = "/api/building/add", method = RequestMethod.POST)
    public String addCurrency(@ModelAttribute("building") Building building, BindingResult result) {
        return buildingService.saveBuilding(building);
    }

    @RequestMapping("/api/building/delete/{Id}")
    public String deleteCurrency(@PathVariable("Id") Long buildingId) {
        return buildingService.deleteBuilding(buildingId);
    }

    @RequestMapping(value = "/api/buildings", method = RequestMethod.GET)
    @ResponseBody
    public String listBuildingsJson(ModelMap model) throws JSONException {
        return buildingService.listBuildingsAsJsonString(model);
    }
}