package com.chuhan.dreamhotel.service;

import com.chuhan.dreamhotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public interface IRoomService {
  Room addNewRoom(MultipartFile photo, String roomTYpe, BigDecimal roomPrice);
}
