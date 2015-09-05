var app = app || {};

(function ($) {
  'use strict';

  app.MainView = Backbone.View.extend({

    el: "body",

    events: {
      "keypress .new-todo": "createOnEnter",
      "click #i1": "click1",
      "click #i2": "click2",
      "click #i3": "click3"
    },

    initialize: function() {
      this.$input = this.$('.new-todo');
      this.$list = $('.todo-list');

      this.listenTo(app.todos, 'add', this.addOne);
      this.listenTo(app.todos, 'reset', this.addAll);

      app.todos.fetch({reset: true});
    },

    createOnEnter: function(e) {
      if (e.which === ENTER_KEY && this.$input.val().trim()) {
        var todo = app.todos.create(this.newAttributes());
        console.log(todo.url());
        console.log(todo.isNew());
      }
    },

    addOne: function(todo){
      var view = new app.TodoView({model: todo});
      this.$list.append(view.render().el);
    },

    addAll: function(){
      this.$list.html('');
      app.todos.each(this.addOne, this);
    },

    newAttributes: function() {
      return {
        title: this.$input.val().trim(),
        // order: app.todos.nextOrder(),
        completed: false
      };
    },

    click2: function() {
      alert("2");
    },

    click3: function() {
      alert("3");
    }
  });

})(jQuery);
