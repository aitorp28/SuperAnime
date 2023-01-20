//Script ajax para consumir la api con sus datos
$(document).ready(()=> {
        $.ajax({
            url:'http://localhost:8081/api/animesAdmin',
            type: 'GET',
            dataType: 'json',
            success: function(res){
                let data='';
                res.forEach(element => {
                    data+=`
						<tr>
							<td>${element.id}</td>
							<td>${element.nombre}</td>
							<td>${element.episodios}</td>
							<td>${element.generos}</td>
							<td>${element.productora.nombre}</td>
							<td>${element.usuario.email}</td>
							
						</tr>
					`
				    });
                $('#tbody').html(data);
            }
        })

});