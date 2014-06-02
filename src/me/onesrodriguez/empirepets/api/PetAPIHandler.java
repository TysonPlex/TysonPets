package me.onesrodriguez.empirepets.api;

import com.dsh105.echopet.api.EchoPetAPI;

public class PetAPIHandler {
    
    public static EchoPetAPI getEchoPetAPI(){
        return EchoPetAPI.getAPI();
    }

}
