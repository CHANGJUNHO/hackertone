var main ={
    init : function (){
        var _this = this;
        $("#btn-save").on('click', function(){
            _this.save();
        });

        $("#account-add").on('click', () => {
            _this.append();
        });
    },
    append : function(){
        $('#bankAccountList').append("<li class=list-group-item >" + $('#bank').val() + " " + $('#account').val() + "</li>");
    },
    save : function() {
        var items = [];
        $('#bankAccountList li').each((index, value) => {
            let item = {};
            const data = $(value).text().split(' ');
            item.bank = data[0]
            item.accountInfo = data[1]
            items.push(item);
        });

        var data = {
            password: $('#password').val(),
            username: $('#username').val(),
            email: $('#email').val(),
            invValue: $('#invValue').val()
        };
        data.bankAccounts = items;

        $.ajax({
            type: 'POST',
            url: '/post/save',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        });
    }
};

main.init();