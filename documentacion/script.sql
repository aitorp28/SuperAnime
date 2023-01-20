INSERT INTO `superanime`.`usuario` (`email`, `password`, `perfil`) VALUES ('a@gmail.com', 'paco', 'admin');
INSERT INTO `superanime`.`usuario` (`email`, `password`, `perfil`) VALUES ('o@gmail.com', 'oskar', 'user');
INSERT INTO `superanime`.`usuario` (`email`, `password`, `perfil`) VALUES ('luis@gmail.com', 'luis', 'user');
INSERT INTO `superanime`.`usuario` (`email`, `password`, `perfil`) VALUES ('josu@gmail.com', 'josu', 'user');

INSERT INTO `superanime`.`productora` (`activo`, `descripcion`, `nombre`) VALUES ('1', 'Productora de peliculas', 'Ghibli');
INSERT INTO `superanime`.`productora` (`activo`, `descripcion`, `nombre`) VALUES ('1', 'Una de las mejores productoras de la actualidad', 'Mappa');
INSERT INTO `superanime`.`productora` (`activo`, `descripcion`, `nombre`) VALUES ('0', 'Una de las antiguas mejores productoras', 'A-1 Pictures');

INSERT INTO `superanime`.`anime` (`activo`, `episodios`, `generos`, `nombre`, `sinopsis`, `validado`, `id_productora`, `id_usuario`) VALUES ('1', '24', 'Romance', 'Kaguya-sama', 'Una historia sobre dos jovenes ', '1', '1', '1');
INSERT INTO `superanime`.`anime` (`activo`, `episodios`, `generos`, `nombre`, `sinopsis`, `validado`, `id_productora`, `id_usuario`) VALUES ('1', '150', 'Sheinen', 'Vagabond', 'La historia de un samuari vagabundo', '1', '2', '3');
INSERT INTO `superanime`.`anime` (`activo`, `episodios`, `generos`, `nombre`, `sinopsis`, `validado`, `id_productora`, `id_usuario`) VALUES ('1', '86', 'Sheinen', 'Monster', 'La historia de un samuari vagabundo', '0', '2', '3');
INSERT INTO `superanime`.`anime` (`activo`, `episodios`, `generos`, `nombre`, `sinopsis`, `validado`, `id_productora`, `id_usuario`) VALUES ('0', '26', 'Sheinen', 'Neon Genesis Evangelion', 'Peak fiction', '1', '2', '2');