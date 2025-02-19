package com.example.demo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table(name = "dict_data", schema = "public")
class DictDatum {
    @Id
    @Column(value = "guild_id")
    var id: Long? = null

    @Column(value = "dict")
    var dict: Any? = null

    @Column(value = "nickname_dict")
    var nicknameDict: Any? = null
}