package com.chuhan.dreamhotel.controller;

import com.chuhan.dreamhotel.model.Room;
import com.chuhan.dreamhotel.response.RoomResponse;
import com.chuhan.dreamhotel.service.IRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class RoomController {
  private final IRoomService roomService; //inject dependency into this class
  public ResponseEntity<RoomResponse> addNewRoom(
        @RequestParam("photo") MultipartFile photo,
        @RequestParam("roomType") String roomTYpe,
        @RequestParam("roomPrice") BigDecimal roomPrice) {
        Room savedRoom = roomService.addNewRoom(photo, roomTYpe, roomPrice);
        RoomResponse response = new RoomResponse(savedRoom.getId(), savedRoom.getRoomType(), savedRoom.getRoomPrice());

      return ResponseEntity.ok(response);
  }
}
