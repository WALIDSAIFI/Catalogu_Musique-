package com.catalogue.musique.Mapper;

import com.catalogue.musique.DTO.RoleDTO;
import com.catalogue.musique.Entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    Role toEntity(RoleDTO roleDTO);

    RoleDTO toDTO(Role role);
}
