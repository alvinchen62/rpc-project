package com.yupi.example.provider;

import com.yupi.example.common.model.Property;
import com.yupi.example.common.service.PropertyService;

public class PropertyServiceImpl implements PropertyService {

    public Property testing(int cnt, Property p) {

        int res = p.getCost() * cnt;
        String s = "newp";
        p.set(s, res);
        return p;
    }
}
