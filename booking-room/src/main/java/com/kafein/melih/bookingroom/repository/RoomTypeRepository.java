package com.kafein.melih.bookingroom.repository;
import com.kafein.melih.bookingroom.model.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface RoomTypeRepository extends JpaRepository<RoomType,Integer> {

    RoomType findById(int id);
   // RoomType findByRtname(String rtypes);

}
