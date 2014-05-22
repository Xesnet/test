using Nancy;

namespace NancyFxSelfHost
{
    public class HomeModule : NancyModule
    {
        public HomeModule()
        {
            Get["/"] = _ => View["index"];
        }
    }
}
