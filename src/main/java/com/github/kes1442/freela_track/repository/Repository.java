package com.github.kes1442.freela_track.repository;

import com.github.kes1442.freela_track.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {
}
