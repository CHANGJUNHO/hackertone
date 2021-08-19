var main = {
    var sock = new SockJS("/ws-stomp");
    var ws = Stomp.over(sock);
    var reconnect = 0;
    var data = {
        room_name : '',
        chatrooms : []
    }

    init :function(){
        $(document).on('keydown', 'div.input-div textarea', function(e){
            if(e.keyCode == 13 && !e.shiftKey){
                e.preventDefault();
                const message = $(this).val();
                ws.send("/pub/chat/message", {}, JSON.stringify({type:'TALK', sender:this.sender, message:this.message}));
                clearTextarea();
            }
        });
    }

    clearTextarea : function(){
        $('div.input-div textarea').val('');
    }
}

main.init();
