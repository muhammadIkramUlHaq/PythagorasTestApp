package com.github.pythagoras.floor.service;

import com.github.pythagoras.building.service.BuildingService;
import com.github.pythagoras.floor.domain.Floor;
import com.github.pythagoras.floor.repository.FloorRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

public class FloorService{
    @Autowired
    private FloorRepository floorRepository;

    @Autowired
    private BuildingService buildingService;

    public String listFloors(ModelMap model) {
        model.addAttribute("floor", new Floor());
        model.addAttribute("floors", floorRepository.findAll());
        model.addAttribute("buildings", buildingService.getAllBuildings());
        return "floors";
    }

    public String saveFloor(Floor floor) {
        floorRepository.save(floor);
        return "redirect:/api/floor";
    }

    public String deleteFloor(Long floorId){
        floorRepository.delete(floorRepository.findOne(floorId));
        return "redirect:/api/floor";
    }

    public String listFloorsAsJsonString(ModelMap map) throws JSONException {
        JSONArray floorArray = new JSONArray();
        for (Floor floor : floorRepository.findAll()) {
            JSONObject floorJSON = new JSONObject();
            floorJSON.put("id", floor.getId());
            floorJSON.put("Name", floor.getName());
            floorJSON.put("Area", floor.getName());
            floorJSON.put("Building", floor.getBuilding());
            floorArray.put(floorJSON);
        }
        return floorArray.toString();
    }


}
