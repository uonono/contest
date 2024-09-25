package com.contest.yh.service;

import com.contest.yh.entity.GetBsShippingAddressListByPatId;
import com.contest.yh.entity.GetBusiness_WXD;
import com.contest.yh.repository.GetBsShippingAddressListByPatIdRepository;
import com.contest.yh.repository.GetBusiness_WXDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetBsShippingAddressListByPatIdService {

    @Autowired
    private GetBsShippingAddressListByPatIdRepository getBsShippingAddressListByPatIdRepository;

    public Mono<GetBsShippingAddressListByPatId> findAll() {
        return Mono.from(getBsShippingAddressListByPatIdRepository.findAll());
    }
}
