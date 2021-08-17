var main ={
    init : function (){
        var _this = this;
        $("#btn-save").on('click', function(){
            _this.save();
        });
    },
    //TODO append가 동작하지 않는 이유 확인
    append : function(){
        $("#account-add").on('click', function(){
            $('#bankAccountList').append("<li>" + $('#bank').val() + " " + $('#account').val() + "</li>");
        }).fail(function (error){
          alert(JSON.stringify(error));
        });
    },
    save : function() {
        var data = {
            id: $('#Id').val(),
            pw: $('#pw').val(),
            name: $('#name').val(),
            email: $('#email').val(),
            invValue: $('#invValue').val()
        };

        $.ajax({
            type: 'POST',
            url: ,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function(){
            alert('글이 등록되었습니다.');
            window.location.href = '/';
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    }
};

main.init();