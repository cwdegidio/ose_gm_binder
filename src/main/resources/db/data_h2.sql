-- INSERT STATS
INSERT INTO ATTRIBUTES (id, str, dex, con, wis, int, cha)
VALUES
    (1, 15, 15, 13, 15, 18, 12),
    (2, 12, 11, 13, 8, 13, 16),
    (3, 12, 11, 15, 16, 10, 10),
    (4, 16, 16, 12, 16, 7, 9),
    (5, 15, 14, 13, 9, 9, 13);

INSERT INTO PLAYER_CHARACTER (id, name, character_class, title, alignment, level, max_hp, stats_id)
VALUES
    (1, 'Aragon', 'FIGHTER', 'Ranger of the North', 'LAW', 10, 85, 1),
    (2, 'Gandalf', 'MAGIC_USER', 'The Grey', 'LAW', 12, 62, 2),
    (3, 'Legolas', 'ELF', 'Prince of Mirkwood', 'LAW', 8, 70, 3),
    (4, 'Frodo', 'HALFLING', 'Master of Bag End', 'NEUTRALITY', 4, 19, 4),
    (5, 'Gimli', 'DWARF', 'Son of Gloin', 'NEUTRALITY', 9, 62, 5);
