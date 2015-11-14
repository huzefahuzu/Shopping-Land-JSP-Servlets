$(document).ready(function() {
    $('#bt').click(function(event) {
            var name = $('#pType').val();
            $.post('ccpc', {
                    pType : name
            });
    });
});