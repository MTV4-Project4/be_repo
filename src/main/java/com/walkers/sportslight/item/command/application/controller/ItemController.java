package com.walkers.sportslight.item.command.application.controller;

import com.walkers.sportslight.item.command.application.dto.ItemRequestDTO;
import com.walkers.sportslight.item.command.application.service.ItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@Tag(name= "아이템 API", description = "아이템 정보를 관리하는 API")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @Operation(summary = "아이템 등록")
    @PostMapping("item")
    private void addItem(@RequestBody ItemRequestDTO itemRequest) {
        itemService.addItem(itemRequest);
    }

    @Operation(summary = "아이템 삭제")
    @DeleteMapping("item/{itemId}")
    private void deleteItem(@PathVariable long itemId) {
        itemService.deleteItem(itemId);
    }
}