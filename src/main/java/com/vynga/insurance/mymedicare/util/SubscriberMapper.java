package com.vynga.insurance.mymedicare.util;

import com.vynga.insurance.mymedicare.entity.SubscriberEntity;
import com.vynga.insurance.mymedicare.model.SubscriberModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriberMapper {
     SubscriberEntity toSubscriberEntity(SubscriberModel subscriberModel) ;
     SubscriberModel toSubscriberModel(SubscriberEntity subscriberEntity);

}
