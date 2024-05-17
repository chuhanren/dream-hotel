package com.chuhan.dreamhotel.service;

import com.chuhan.dreamhotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.math.BigDecimal;
import java.sql.Blob;

public class RoomServiceImpl implements IRoomService{
  @Override
  public Room addNewRoom(MultipartFile file, String roomTYpe, BigDecimal roomPrice) {
    Room room = new Room();
    room.setRoomType(roomTYpe);
    room.setRoomPrice(roomPrice);

    if(!file.isEmpty()) {
      byte[] photoBytes = file.getBytes();
      Blob photoBlob = new SerialBlob(photoBytes);
      room.setPhoto(photoBlob);
    }

    return null;
  }
}
