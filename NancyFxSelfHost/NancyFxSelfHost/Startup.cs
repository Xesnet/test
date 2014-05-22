using Owin;

namespace NancyFxSelfHost
{
    class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            app.UseNancy();
        }
    }
}
