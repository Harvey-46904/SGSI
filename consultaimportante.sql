select 
	g.nombre,
	i.nombre,
	r.confidencialidad,
	rc.descripcion as "RECOMENDACION CONFIDENCIALIDAD",
	r.integridad,
	ri.descripcion as "RECOMENDACION INTEGRIDAD",
	r.disponibilidad,
	rd.descripcion as "RECOMENDACION DISPONIBILIDAD"
	
from grupos g
	join item i
		join respuestas r
			join resultado_confidencialidad rc
			on r.id_pregunta=rc.id_pregunta and rc.estado=r.confidencialidad
			join resultado_integridad ri
			on r.id_pregunta=ri.id_pregunta and r.integridad=ri.estado
			join resultado_disponibilidad rd
			on r.id_pregunta=rd.id_pregunta and r.disponibilidad=rd.estado
		on i.codigo_pregunta=r.id_pregunta
	on i.fk_id_grupo=g.id_grupo

