package com.bankapplication.application.boundaries.output.register;

import com.bankapplication.infrastructure.gateways.mapper.UserJpaMapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUserRegisterGateway extends CrudRepository<UserJpaMapper, UUID> {
}
