package ru.sanctio.datageneratormicro.web.mapper;

import org.mapstruct.Mapper;
import ru.sanctio.datageneratormicro.model.Data;
import ru.sanctio.datageneratormicro.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {

}
