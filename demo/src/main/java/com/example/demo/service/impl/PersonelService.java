package com.example.demo.service.impl;

import com.example.demo.dto.impl.PersonelDto;
import com.example.demo.entity.impl.PersonelEntity;
import com.example.demo.repository.PersonelRepository;
import com.example.demo.service.abst.Readable;
import com.example.demo.service.abst.Writeable;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonelService implements Readable<PersonelDto, Integer >, Writeable<PersonelDto, Integer> {

    private final PersonelRepository personelRepository;
    private final ModelMapper modelMapper;

    public PersonelService(PersonelRepository personelRepository, ModelMapper modelMapper) {
        this.personelRepository = personelRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public PersonelDto getById(Integer id) {
        return null;
    }

    @Override
    public List<PersonelDto> getAll() {
        return List.of();
    }


    @Override
    public PersonelDto add(PersonelDto personelDto) {

        PersonelEntity personelEntity = modelMapper.map(personelDto, PersonelEntity.class);

        return modelMapper.map(personelRepository.save(personelEntity), PersonelDto.class);
    }

    @Override
    public PersonelDto modify(PersonelDto personelEntity, Integer id) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }
}
