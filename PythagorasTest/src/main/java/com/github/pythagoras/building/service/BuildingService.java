package com.github.pythagoras.building.service;

import com.github.pythagoras.building.domain.Building;
import com.github.pythagoras.building.repository.BuildingRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    public String listBuildings(ModelMap model) {
        model.addAttribute("building", new Building());
        model.addAttribute("buildings", buildingRepository.findAll());
        return "buildings";
    }

    public String saveBuilding(Building building) {
        buildingRepository.save(building);
        return "redirect:/api/building";
    }

    public String deleteBuilding(Long buildingId){
        buildingRepository.delete(buildingRepository.findOne(buildingId));
        return "redirect:/api/building";
    }

    public String listBuildingsAsJsonString(ModelMap map) throws JSONException {
        JSONArray buildingArray = new JSONArray();
        for (Building building : buildingRepository.findAll()) {
            JSONObject buildingJSON = new JSONObject();
            buildingJSON.put("id", building.getId());
            buildingJSON.put("Name", building.getName());
            buildingArray.put(buildingJSON);
        }
        return buildingArray.toString();
    }

    public List<String> getAllBuildings(){
        List<String> listOfBuildings = new ArrayList<String>();
        for(Building building : buildingRepository.findAll()){
            listOfBuildings.add(building.getName());
        }

        return listOfBuildings;
    }
}
