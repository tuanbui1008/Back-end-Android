package com.example.bookingroom.hotel.room.service;

import com.example.bookingroom.hotel.room.bean.RoomBean;
import com.example.bookingroom.hotel.room.dao.RoomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomDAO roomDAO;

    @Autowired
    private EntityManager entityManager;

//    public List<RoomBean> getLstRoom(){
//
//    }
}
