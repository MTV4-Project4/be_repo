package com.walkers.sportslight.item.command.application.dto;

import com.walkers.sportslight.item.command.domain.aggregate.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemRequestDTO {
    private String itemName;
    private MultipartFile itemImage;
    private ItemType itemType;
    private int itemPrice;
}
