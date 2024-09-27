package com.contest.yh.controller;

import com.contest.yh.entity.*;
import com.contest.yh.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/GetHspRequest")
public class GetHspRequestController {

    @Autowired
    private GetPhoneInstitutionService service;

    @Autowired
    private GetBestSellersService getBestSellersService;

    @Autowired
    private GetBusiness_WXDService getBusinessWxdService;

    @Autowired
    private GetByBsItemIdsService getByBsItemIdsService;

    @Autowired
    private getSecondBasedService getSecondBasedService;

    // 获取所有文档
    @PostMapping("/GetPhoneInstitution")
    public Mono<GetPhoneInstitution> getAllDocuments() {
        return Mono.from(service.getAllDocuments());
    }

    // 获取所有文档
    @PostMapping("/GetBestSellers")
    public Mono<GetBestSellers> GetBestSellers() {
        return Mono.from(getBestSellersService.findAll());
    }

    // 获取所有文档
    @PostMapping("/GetBusiness_WXD")
    public Mono<GetBusiness_WXD> GetBusiness_WXD() {
        return Mono.from(getBusinessWxdService.findAll());
    }

    // 获取所有文档
    @PostMapping("/GetByBsItemIds")
    public Mono<GetByBsItemIds> GetByBsItemIds() {
        return Mono.from(getByBsItemIdsService.findAll());
    }

    // 获取所有文档
    @PostMapping("/getSecondBased")
    public Mono<GetSecondBased> getSecondBased() {
        return Mono.from(getSecondBasedService.findAll());
    }

    @Autowired
    private GetCodeProductService getCodeProductService;

    @PostMapping("/GetCodeProduct")
    public Mono<GetCodeProduct> GetCodeProduct() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(getCodeProductService.findAll());
    }

    @Autowired
    private GetByBsItemIdService getByBsItemIdService;

    @PostMapping("/GetByBsItemId")
    public Mono<GetByBsItemId> GetByBsItemId() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(getByBsItemIdService.findAll());
    }
    
    @Autowired
    private InsertSlOrderService insertSlOrderService;

    @PostMapping("/InsertSlOrder")
    public Mono<InsertSlOrder> InsertSlOrder() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(insertSlOrderService.findAll());
    }

    @Autowired
    private GetBestSellersPagingService getBestSellersPagingService;

    @PostMapping("/GetBestSellersPaging")
    public Mono<GetBestSellersPaging> GetBestSellersPaging() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(getBestSellersPagingService.findAll());
    }
    // 根据 WarningCode 获取单个文档
    /*@GetMapping("/warningCode/{code}")
    public Mono<GetPhoneInstitution> getDocumentByWarningCode(@PathVariable("code") int warningCode) {
        return service.getDocumentByWarningCode(warningCode);
    }*/
}
