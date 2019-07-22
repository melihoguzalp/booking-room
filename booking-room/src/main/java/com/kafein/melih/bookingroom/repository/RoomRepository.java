package com.kafein.melih.bookingroom.repository;


import com.kafein.melih.bookingroom.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {

    Room findById(int id);

    List<Room> findAllByDistrict_Id(int id);


    @Query(value = "SELECT * FROM room WHERE room.active=0 AND room_type_id = :roomTypeId AND district_id = :districtId", nativeQuery = true)
    List<Room> findRoomsByRoomTypeAndDistrict(int roomTypeId, int districtId);
}
